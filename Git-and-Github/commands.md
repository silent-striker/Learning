---
title: "Commands"
tags: ""
---
### configuring git
-   git config --local/global/system:
    - this command is used for configuring your git.
    - there are three levels of configuration
      * Local &rarr; this config is for a specific local repo
      * Global &rarr; this config is for a particular user in the system
      * System &rarr; this config is for the whole system irrespective of the user
    - Priority order for configuration is local > global > system.

### Commands on repository
-   git init:
    -   It is to create an empty git repository → to track progress of a local project.

-   touch ... :
    -   touch .gitignore → .gitignore tracks the files you want to ignore so they aren't pushed to your remote repo.

-   git status:
    -   This checks the status of the repo, checks all changed files, which branch is used etc.

-   git add:
    -   Used to add files to the staging area.
    -   extra options:
        -   \-A (add all files)

-   git reset:
    -   Without an additional file name, this would remove all files in staging area.
    -   git reset file_name:
        -   would remove file_name from staging area.

-   git commit:
    -   extra options:
        -   \-m : adds commit message in "" after -m.

-   git log:
    -   shows all the commits made.
    -   use **--oneline** to display all the commits in shorter notation.

-   git clone &lt; url > &lt; path where to store >:
    -   clones a remote repo and stores it at the path mentioned.

-   git remote:
    -   extra options:
        -   \-v : shows info about the remote repo cloned from.
        -   set-url origin new.git.url/here : for setting new origin url

-   git branch:
    -   Show branch info of a repo.
    -   extra options:
        -   \-a : shows all branches present in the remote repo and local repo

-   git push:
    -   this pushes all the commits to the remote repo.

### Undoing and looking back at commits
-   git checkout "commit": (safe command)
    - helps you to revist a state of the file when the "commit" was added to the repo.
    - When we use this command the **HEAD** detaches from current state of project to the situation when we made that commit.
    - To get back to the current state use "git checkout master/branch"
    - It allows you the **read the state** of your project at that commit
    - Doesn't allow deleting a commit.

-   git revert "commit": (safe but not as checkout)
    - This command allows you to **revert the changes done by a commit**.
    - All it does it creates a new commit that removes the changes of "commit".
    - Any of the commits can be revert.

-   git reset "commit": (dangerous command use with caution!)
    - This command resets the state of the project to that "commit" and **log of the commits after this are removed permanently**. Changes are still present but are unstaged.
    - In case you want to permanently remove those changes too from the files then use **--hard** option, which does a hard reset