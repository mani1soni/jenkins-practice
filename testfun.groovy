#!/usr/bin/env groovy
def call(def REPO_PATH,def APP_NAME){
    stages{
        stage('build and deploy'){
            steps{
                sh '''
                cd REPO_PATH/APP_NAME/
                mkdir testing
                '''
            }
        }
    }
}
