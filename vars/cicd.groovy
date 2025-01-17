def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}
def buildArtifact()
{
  sh "mvn package"
}
def deployTomcat(jobname,ip,context)
{
  sh "deploy adapters: [tomcat9(credentialsId: ${3fc91db5-bad6-498b-8a31-3c19b30e6cbd}, path: '', url: ${http://172.31.83.236:8080})], contextPath: ${testapp}, war: '**/*.war'"
}
def runSelenium(jobname)
{
  sh "java-jar /var/lib/jenkins/wokspace/${jobname}/testing.jar"
}
  
