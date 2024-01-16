def call() {
    sh 'trivy image vishnusunkara/youtube:latest > trivyimage.txt'
}
