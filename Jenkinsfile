//Map modules = [:]
library identifier: 'my-shared-library@master', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '', remote: 'https://github.com/mani1soni/my-shared-library.git', traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]])

//def docker = load 'docker.groovy' 
pipeline{
     agent any     
     stages{
          stage('calling function'){
               steps{
                    test('test','ubuntu')
                    
               }
          }
          stage('notification'){
               steps{
                    post {
                         success {
                              emailext attachLog: true, 
                              body: '''success''', 
                              subject: 'build report', 
                              to: 'manish.soni@techifysolutions.com'
                         }
                         failure {
                              emailext attachLog: true, body: '''test failed and rollback initiated''', subject: 'jenkins build', to: 'manish.soni8403@gmail.com'
                         }
                    }
               }
          }
     }
}
//genric()
//script{
     //   genric()
    //modules.test = load "docker.groovy"
    //modules.test
    //}




