pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git url: 'https://github.com/Aswathanarayanan/SPE_miniproject.git'
            }
        }
        stage('Maven build'){
            steps{
                //sh 'cd /var/lib/jenkins/workspace/miniproject_calculator/calculator'
                sh 'mvn -f /var/lib/jenkins/workspace/miniproject_calculator/calculator clean install'
            }
        }
        stage('Build image'){
            steps{
                sh 'docker build -t aswathanarayanan/test1 ./calculator'
            }
        }
        stage('Push image'){
            steps{
                //withDockerRegistry([credentialsId:'Dockercred' , url: '']){
                sh 'docker login -u aswathanarayanan -p Narayanan@123'
                sh 'docker push aswathanarayanan/test1:latest'
                //    dockerImage.push()
                //}
            }
        }
        stage('pull image'){
            steps {
                ansiblePlaybook ('imagepull.yml')
            }  
        }
    }
}