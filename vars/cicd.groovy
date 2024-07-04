def gitDownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"

}

def buildArtifact()
{
   sh 'mvn package'
}

def deployTomcat(jobname,ip,context)
{
   sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"

}

def runSelenium(jobname)
{
   sh 'java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar'

}

