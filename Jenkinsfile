//Map modules = [:]
//library identifier: 'genric.groovy@master', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '', remote: 'https://github.com/mani1soni/jenkins-practice.git', traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]])
//@Library('genric.groovy')
def myfun = load 'docker.groovy'
 pipeline{
     agent any
     stages{
          stage('calling function'){
               steps{
                    docker('test','ubuntu')
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




