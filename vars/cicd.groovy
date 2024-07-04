def gitDownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"

}

def buildArtifact()
{
   sh 'mvn package'
}


