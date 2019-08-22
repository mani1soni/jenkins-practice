#!/usr/bin/env groovy
//def call(REPO_PATH,APP_NAME){
//    stages{
//        stage('build and deploy'){
//            steps{
//                sh '''
//                cd REPO_PATH/APP_NAME/
//                mkdir testing
//                '''
//            }
//        }
//    }
//}
def call(){
    stages{
        stage('build and deploy'){
            steps{
                sh '''
                cd /home/manish/Desktop/test/
                mkdir testing
                '''
            }
        }
    }
}