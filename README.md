# 📦 Sistema de Gestão de Produtos e Fornecedores (Java Swing Prototype)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-007396?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-8.2-1B6AC6?style=for-the-badge&logo=apache-netbeans&logoColor=white)

Um protótipo de aplicação desktop para cadastro de produtos e fornecedores. O foco central deste projeto não é atuar como uma solução de produção, mas sim servir como um laboratório prático para o gerenciamento de estado em memória e a manipulação de eventos assíncronos via AWT/Swing.

---

## 🚀 Dinâmica de Funcionalidades

- **Alocação Dinâmica:** Instanciação de objetos `Produto` e `Fornecedor` sob demanda gerenciados dinamicamente.
- **Data Binding Reativo:** Atualização bidirecional entre a estrutura de dados e os componentes gráficos (caixas de combinação preenchendo campos de texto) orientada pelo evento `itemStateChanged`.
- **Sanitização de Input Visual:** Uso da classe `JFormattedTextField` em conjunto com `formatterFactory` para forçar máscaras de validação rígidas para CNPJ (`##.###.###/####-##`) e Telefones (`(##) #####-####`).
- **Reflexão Polimórfica:** Sobrescrita (`@Override`) do método `.toString()` nas classes de entidade,
