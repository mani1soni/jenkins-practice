//Map modules = [:]
//library identifier: 'docker.groovy@master', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '', remote: 'https://github.com/mani1soni/my-shared-library.git', traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]])
//@Library('genric.groovy')
node {
     def docker = load('docker.groovy')
}

pipeline{
     agent any
     stages{
          stage('calling function'){
               steps{
                    script{
                         docker()
                         //modules.test = load "docker.groovy"
                         //modules.test()
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




