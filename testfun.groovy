#!/usr/bin/env groovy
import hudson.model.*
node('master'){
    def call(REPO_PATH,APP_NAME){
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
}