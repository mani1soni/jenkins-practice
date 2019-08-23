#!/usr/bin/env groovy
import net.courtanet.jenkins.Utils
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
