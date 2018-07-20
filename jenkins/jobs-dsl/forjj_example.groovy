
multibranchPipelineJob('forjj-example') {
  description('Folder for Project forjj-example generated and maintained by Forjj. To update it use forjj update')
  branchSources {
      github {
          repoOwner('forjj-sample')
          repository('forjj-example')
      }
  }
  orphanedItemStrategy {
      discardOldItems {
          numToKeep(20)
      }
  }
}
