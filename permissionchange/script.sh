#!/bin/bash
 
#1
cat > Permission.txt <<EOF
each of the three "rwx" characters refers to a different operation you can perform on the fle.
The 'r' means you can "read" the file's contents.
The 'w' means you can "write", or modify the file's contents.
The 'x' means you can "execute" the file. This permission is given only if the file is a program.
If any of the "rwx" characters are replaced by a "-", then that permission has been revoked.
EOF
 
#2
if [ -f Permission.txt ]; then
    echo "file Exists"
else
    echo "file does not Exist"
    exit 1
fi
 
#3
if [ -r Permission.txt ] && [ -w Permission.txt ]; then
    echo "File Permission has been changed"
fi
 
#4
perm=$(stat -c"%A" Permission.txt )
filename="Permission.txt"
echo "$perm $filename"> Permfile.txt
   