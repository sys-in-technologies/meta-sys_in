# meta-sys_in
Yocto BSP layer for the embedded boards developed by Sys-In technologies.

## Introduction

Sys-In technologies provides customised IoT solutions targeting industrial applications.

The solution framework is called RAFT. It consists of cloud service, edge computing, endpoint sensory and execution.

In this yocto layer, we provide configuration for building embedded system for edge and and endpoint embedded systems.

Both edge and endpoint devices might be build with different machine and boards. In general we use inert gas to indicate the complexity level, with which, helium is the simplest form and neon, argon indicate more complex configurations.

we use the following naming rules to identify the build:
raft-<system>-<configuration>-<variation>-<board>, an example could be raft-ep-neon-va-b0.

### Distro
This layer provides distros listed as below:
+ raft-ep, distro for raft endpoint device, linux at bare minimal.

### Machine
This layer provides machines listed as below:
+ raft-ep-neon-va, t113s based machine.

## Build

This yocto layer needs to be used together with the yocto project. Please follow the instruction to setup yocto project first.

### add sys-in layer
+ check out this git repository into poky directory;
+ set environment variable TEMPLATECONF to the path as meta-sys_in/conf/templates/default;

### create the build env
+ change directory to which containing poky;
+ source poky/oe-init-build-env <name of the building directory>;
+ bitbake <name of the image>;

Note: currently tested with core-image-minimal, the wic file could be used to burn the sdcard and boot the system properly.
