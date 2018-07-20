
multibranchPipelineJob('forjj-sample-production') {
  description('Folder for Project forjj-sample-production generated and maintained by Forjj. To update it use forjj update')
  branchSources {
      github {
          repoOwner('forjj-sample')
          repository('forjj-sample-production')
      }
  }
  orphanedItemStrategy {
      discardOldItems {
          numToKeep(20)
      }
  }
}
