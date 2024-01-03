pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                script {
                    // Clone the GitHub repository
                    checkout scm
                }
            }
        }

        stage('Execute SQL Queries') {
            steps {
                script {
                    // Connect to MySQL and execute SQL queries
                    def mysqlHost = '192.168.29.161'
                    def mysqlUser = 'dbops'
                    def mysqlPassword = 'dbops@123'
                    def mysqlDatabase = 'example'

                    sh "mysql -h $mysqlHost -u $mysqlUser -p$mysqlPassword $mysqlDatabase < sql_queries/query1.sql"
                    sh "mysql -h $mysqlHost -u $mysqlUser -p$mysqlPassword $mysqlDatabase < sql_queries/query2.sql"
                    // Add more SQL queries as needed
                }
            }
        }
    }
}
