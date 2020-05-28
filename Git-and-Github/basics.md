---
title: "Basics"
tags: ""
---
A version control system is a system that is able to keep track of various changes done on files in a project and is able to store all the different versions of a project.

There are two types of version control system:
* Centralised version control system (CVCS): Here the project is stored on one main server along with its versions whereas the individual computer only hold working copy of the project and not all the versions.

* Distributed version control system (DVCS): Here the project is stored in the main server along with copy of it (including different versions) is stored on individual computers as local repositories.

What is Git?
Git is a **distributed version control system (DVCS)**. It supports trunk based development (we can work on different versions at the same time by creating branches)

Git is making my life so easy as it keeps all the versions of my files and tracks every changes.
_Git is wonderful_

Q) Difference between a directory and repository?
Difference between a directory and repository:
* Directory is file in the filesystem of an OS that can contain many other files such as images, text, and video files etc. It doesn't tell what changes are made to any file but just mentions when it has been updated.

* Repository on the other hand is part of version control system that that contains files and multiple versions of files but the main purpose is to store code and other dependencies. It provides a structured way to store code and dependencies.

A repository contains three primary aspects &rarr; trunk (current version of the software project), branches (used to develop other versions along without disturbing current version), tags (they are used to save diff versions)

Branches are generally created when you want to work on new features without changing the current version of the project, but roll out those features in a major update.

For minor updates, we directly commit on the master branch.

Some extensions:

-   .git (stores all the versions, changes)
-   .gitignore (file which contains files that need to be ignored by git)
-   .project
-   .DS_Store

Three areas in using git in local system:

-   Working dir (where the changes are made)
-   Staging area (where we select which files/changes are going to reflect in the project)
-   .git directory (repo) (keeps track of the changes)
