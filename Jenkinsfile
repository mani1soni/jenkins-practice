//Map modules = [:]
library identifier: 'genric.groovy@1.0', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '', remote: 'https://github.com/mani1soni/jenkins-practice.git', traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]])
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
                    genric()

                    //modules.test = load "testfun.groovy"
                    //modules.test('${REPO_PATH}','${APP_NAME}')
                }
            }
        }
    }
}