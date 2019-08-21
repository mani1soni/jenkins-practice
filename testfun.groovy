def call(REPO_PATH,APP_NAME){
    return{
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