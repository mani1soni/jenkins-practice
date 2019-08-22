#!/usr/bin/env groovy
def call(def path,def app){
    stages{
        stage('build and deploy'){
            steps{
                sh '''
                cd ${path}/${app}/
                mkdir testing
                '''
            }
        }
    }
}
