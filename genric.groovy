#!/usr/bin/env groovy
pipeline{
    agent any
    stages{
        stage('build-deploy'){
            steps{
                sh''' 
                cd /home/manish/Desktop/test/
                mkdir testing
                '''
            }
        }
    }
}
