# Software installation - Mac

## Install Homebrew

The first step is to install Homebrew, which is a software package manager that
will help us install everything else we need.

- Go to the [Homebrew website](https://brew.sh/) and read the installation instructions.
- To install, you will copy/paste a command from their webpage to your Terminal.

You can install everything else with Homebrew, from the command line.


## Install Java

Install the Java Development Kit (JDK)
([info](https://formulae.brew.sh/formula/openjdk)). 

```
brew install openjdk
```

Check that everything is installed properly.  These commands will
report the Java version.

```
javac -version
java -version
```

## Install Geany 

Install the Geany open source text editor 
([info](https://www.geany.org/)).

```
brew install geany
```

Create an alias for the command line.  

```
alias geany=/Applications/Geany.app/Contents/MacOS/geany
```

To set this alias every time you open a new Terminal window, add the alias line
above to your `~/.zshrc` (or `~/.bashrc`) file.


## Create a GitHub account

[GitHub](https://github.com/) hosts code repositories for software projects.
We will be using GitHub for sharing code.

Please make an account and email me your account name.


## Install GitHub Desktop

[GitHub Deskop](https://desktop.github.com/) is a desktop application
that facilitates interacting with repositories on GitHub.

```
brew install github
```

