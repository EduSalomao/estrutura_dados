from StaticStack import StaticStack

stack = StaticStack()

# Testando o método Append
stack.Append("IFBA")
stack.Append("UESB")
stack.Append("UFBA")

# Exibindo os dados da pilha
stack.showData()  # Saída: All stack data: 1 2 3

# Testando o método Pop
stack.Pop()

# Exibindo os dados da pilha apos o Pop
stack.showData()

# Exibindo o elemento no topo da pilha
print("Topo da lista: ")
stack.Top()
