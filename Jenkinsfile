library identifier: 'testfun.groovy@1.0', retriever: legacySCM()
//def myfun = load 'testfun.groovy'
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
                    testfun.groovy('${REPO_PATH}','${APP_NAME}')
                }
            }
        }
    }
}