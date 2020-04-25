---
title: "Day 2"
tags: ""
---
Session-1:

-   Camera code without OpenCV library
    -   We use use **picamera** library
    -   Raspberry Pi camera takes 0.5 seconds to bootup, so we have to wait before taking pic.
    -   Shutter speed
    -   If you use camera.start_preview() make sure to end with camera.stop_preview() as we can't terminate it by "ctrl +c".
    -   If I don't type "camera.close()" then my cam doesn't stop.
    -   "camera.IMAGE_EFFECTS" is a list of all effects in picamera.
    -   Intruder detection system using cam, IR:
        -   We will capture an image then convert image to binary and send it through it email.
        -   **Binary file:** This is a file whose data is in binary. Binary file vs Normal file?
        -   PIR: Passive Infrared Detection
        -   We have to send data in **Multiparts  format**.
        -   We have to send in Multiparts format, which partitions data and sent as packets. We do this as there is limit on capacity of a packet.
        -   octet-stream, packets are going group of 8.
        -   Default basic encoding is base64 algorithm.
    -   Notepad.pw
    -   Videos in Raspberry pi is **.h264 format**.
-   Why can't we use more space as swap, here it is not possible because read/write operations are limited and swap which acts like RAM will need more read/write and operations which is not feasible. So swap is just used as an emergency RAM.
-   About ML basics:
    -   OpenCV (open source computer vision library)
        -   Firstly they used c/c++, so all the algos are in c++ but they are wrapped in python, so we can use it as python modules.
    -   Cascades
        -   It is basically description of something, or dataset or information about something.
        -   HAAR cascade
    -   Classifier
        -   classifier is either a function (that uses cascades to evaluate) or it can be a cascade (description).
    -   What is Training Algorithm?
-   Face recognition:
    -   In order to avoid colors, we convert photo to gray to reduce noise by colors.

Session-2:

-   "def" is a keyword in python to define a function.
-   LBPHFaceRecognizer is the best algorithm for face recognition.
-   Pi will stop working at high temperature.
-   "Confidence" is nothing but deviation in Facial recognition. Lower the confidence the better.
