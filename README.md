# exercisesListJava

Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.

=======================================

Resultado do programa em console.

How many employees will be registered? 3 (valor de entrada informado pelo usuário)

Emplyoee #1:
Id: 333 (valor de entrada informado pelo usuário)
Name: Maria Brown (valor de entrada informado pelo usuário)
Salary: 4000.00 (valor de entrada informado pelo usuário)

Emplyoee #2:
Id: 536 (valor de entrada informado pelo usuário)
Name: Alex Grey (valor de entrada informado pelo usuário)
Salary: 3000.00 (valor de entrada informado pelo usuário)

Emplyoee #3:
Id: 772 (valor de entrada informado pelo usuário)
Name: Bob Green (valor de entrada informado pelo usuário)
Salary: 5000.00 (valor de entrada informado pelo usuário)

Enter the employee id that will have salary increase : 536 (informa um id e pesquisa na lista de cadastros se há o id informado, caso sim, solicita a inserção da porcentagem a ser acrescentada ao salário do funcionário)
Enter the percentage: 10.0


//Listagem dos funcionários cadastrados com a respectiva alteração.
List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00


OBS: Caso não seja encontrado um id dentro da lista de funcionários cadastrados, a aplicação retorna null e é exibido uma mensagem que o funcionário não existe.
