Map modules = [:]
//library identifier: 'docker.groovy@master', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '', remote: 'https://github.com/mani1soni/my-shared-library.git', traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]])
//@Library('genric.groovy')
//def docker = load 'docker.groovy' 
pipeline{
     agent any
     stages{
          stage('calling function'){
               steps{
                    script{
                         //docker.first()
                         modules.test = load "docker.groovy"
                         modules.test.call()
                    }
               }
         }
     }
}
//genric()
//script{
     //   genric()
    //modules.test = load "genric.groovy"
    //modules.test()
    //}




