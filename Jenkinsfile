Map modules = [:]
pipeline{
    agent any
    environment{
        REPO_PATH='/home/manish/Desktop'
        APP_NAME='test'
    }
    stages{
        stage('calling function'){
            steps{
                script{
                    modules.test = load "testfun.groovy"
                    modules.test('~/Desktop','test')
                }
            }
        }
    }
}