---
title: "Day 1"
tags: ""
---
Session-1:

-   Raspberry Pi is a credit-card sized single-board computer.
-   It has various ports, acts like a full fledged computer. It is a DIgital device, it understands only 0s and 1s.
-   Raspbian is the Debian-based os for Raspberry Pi. Buster is the latest  version.
-   Swap space: It is the space on hard drive which is used as a virtual RAM. We have to give some space from Hard drive.
-   **Raspberry.org** is the web site.
-   ".img" is a disk image file. Win32 Disk imager is for running .img files as .img was for installing OS earlier.
-   Win32 imager is for buring SD card basically for making SD card as bootable.
-   VNC server is used to connect Raspberry Pi remotely. It is pre-installed on Pi.
-   Dual band router.
-   Angry IP scanner shows all IPs of all devices connected to the network your connected to at that time.
-   Filezilla is used to transferring files. It will use SSH protocol for transfer.
-   GPIO: General purpose input-output.
-   pintout.xyz for checking the GPIO board notations.
-   IR sensor: IC is used as OPAM (Operation Amplifier).

Session-2:

-   module vs sensor
-   Sensor alone is only a device meant for giving data but this is given in analog form.
-   A module consists the respective sensor along with circuitry and other things that helps convert analog to digital.
-   "raspistill -o xyz.jpg"  is for using cam and taking a picture
-   DHT: digital humidity and temperature sensor, DHT 11 (always blue), DHT 22 (always white).
-   For using Adafruit sensor we have to Adafruit_DHT package.
-   ADA fruit sensor
-   In python, functions can return multi-values at once.
-   To import a package in the program:
    -   copy the package needed to be imported in the same directory as the program
    -   use pip3 and install the package globally (but this takes up extra space in hard disk)
-   SMTP: Simple Mail Transfer Protocol.
-   "smtplib" is a python library that allows to connect to email server and send email.
-   TLS: Transport Lane Security.
-   All not encrypted data go through 8080 port. HTTP goes through port 8080
-   HTTPS uses port 443
-   Filezilla: uses ssh to transfer file
    -   Goal is to transfer files btw my pc and raspberry pi.
    -   My pc and pi have to be on same network.
    -   SFTP: Secure File Transfer Protocol
