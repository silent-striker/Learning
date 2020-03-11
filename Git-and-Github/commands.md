---
title: "Commands"
tags: ""
---
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
    -
    -   extra options:
        -   \-m : adds commit message in "" after -m.

-   git log:
    -   shows all the commits made.

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
