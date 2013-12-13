Node-Webkit
-----------

Node-Webkit can be downloaded from:

https://github.com/rogerwang/node-webkit

After obtaining a copy of Node-Webkit unzip it and then copy your new project
to the root of the Node-Webkit folder. 

Open up a command prompt (or shell) to the Node-Webkit directory and type
the following and hit enter:

nw <your app name>

Your new application should load up in Node-Webkit.

Clojurescript
-------------

There are two build configurations 'dev' and 'prod'. You can start the compiler
using the following command which will automatically build your Clojurescript
and watch your files and recompile as needed.

lein cljsbuild auto dev

--

Frank Hale <frankhale@gmail.com>
