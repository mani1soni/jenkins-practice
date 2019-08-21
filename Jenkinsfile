pipeline{
    agent any
    environment{
        REPO_PATH='/home/manish/Desktop'
        APP_NAME='test'
    }
    stages{
        stage('calling function'){
            testfun.groovy('${REPO_PATH}','${APP_NAME}')
        }
    }
}