#!/usr/bin/env groovy
def call(appname){
    pipeline{
        agent any
        stages{
            stage('build-deploy'){
                steps{
                    sh''' 
                    cd /home/manish/Desktop/test/
                    bash hello.sh
                    '''
                }
            }
        }
    }
}