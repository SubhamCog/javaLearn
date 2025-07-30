echo "Enter a positive integer:"
read num
 
if ! [[ "$num" =~ ^[0-9]+$ ]]; then
    echo "Error: Please enter a valid non-negative integer."
    exit 1
fi
 
fact=1
i=1
 
while [ $i -le $num ]
do
    fact=$((fact * i))
    i=$((i+1))
done
 
echo "Factorial of $num is: $fact"