def call(){
    sh "sudo docker run -d --name youtube1 -p 3000:3000 vishnusunkara/youtube:latest"
}
