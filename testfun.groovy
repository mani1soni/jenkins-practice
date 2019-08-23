#!/usr/bin/env groovy
def call(def path,def app){
    return{
        stage('build and deploy'){
            sh''' 
            cd ${path}/${app}/
            mkdir testing
            '''
        }
    }
}

