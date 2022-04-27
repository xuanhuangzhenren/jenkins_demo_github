pipeline{
    agent any

    stages{
        stage('compile'){
            steps{
                echo 'Hello World'
            }
        }

        stage('Test'){
            steps{
                echo 'Hello World test'
            }
        }
        stage('Build'){
                     steps{
                         echo 'Hello World build'
                     }
                 }
        stage('Deploy'){
            steps{
                echo 'Hello World deploy'
                sh 'pwd && ls -la'
            }
        }
    }
}