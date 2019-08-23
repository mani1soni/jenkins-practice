#!/usr/bin/env groovy
def call(def path,def app){
    return{
        node('master'){
            stage('build and deploy'){
                sh''' 
                cd ${path}/${app}/
                mkdir testing
                '''
            }
        }
    }
}

