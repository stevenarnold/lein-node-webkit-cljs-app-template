# node-webkit-cljs-app

A Leiningen template for Node-Webkit Clojurescript apps.

# Usage

NOTE: This has not been uploaded to clojars yet so for the time being simply
download and then use lein install to install it. After installation it'll work
just like if it was installed via Clojars.

You can clone the directory or either download it as a zip. 

Once you have the template, change into the top directory and run the following
command from the command line:

```
lein install
```

After installation you can create a new project using the following command:

```
lein new node-webkit-cljs-app [app-name-here]
```

There are two build configurations 'dev' and 'prod'. You can start the compiler
using the following command which will automatically build your Clojurescript
and watch your files and recompile as needed.

```
lein cljsbuild auto dev
```

If the project was not created within your node-webkit directory and if Node-Webkit
is not on your path simply copy your project to your Node-Webkit directory.

If you do not have Node-Webkit it can be downloaded from:

https://github.com/rogerwang/node-webkit

After obtaining a copy of Node-Webkit unzip it and then copy your new project
to the root of the Node-Webkit folder. 

Open up a command prompt to the Node-Webkit directory and type the 
following and hit enter:

```
nw <your app name>
```

Your new application should load up in Node-Webkit.

## License

Copyright © 2013 Frank Hale

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.