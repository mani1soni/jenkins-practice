pipeline{
    agent any
    environment{
        REPO_PATH='/home/manish/Desktop'
        APP_NAME='test'
    }
    stages{
        stage('calling function'){
            steps{
                def myfun = load("testfun.groovy")
                script{
                    myfun('${REPO_PATH}','${APP_NAME}')
                }
            }
        }
    }
}