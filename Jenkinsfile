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
          notification()
         }
     }
}
//genric()
//script{
     //   genric()
    //modules.test = load "docker.groovy"
    //modules.test
    //}




