# HpViagensAPI
 Repositório da API de uma agência de viagens. 
## Tecnologias utilizadas
- Java
- Spring Framework
- Swagger
- MySQL (Banco de dados relacional)

# Instruções para máquina local
Para que o projeto funcione de maneira correta é necessário que seja cadastrado um cliente, uma viagem e um pagamento de maneira individual para que você consiga criar uma reserva.
- Crie um cliente
- Crie uma viagem
- Crie um pagamento
- Crie uma reserva

## Visão Geral
Esta API permite o gerenciamento de clientes, pagamentos, viagens e reservas, oferecendo endpoints para criação, leitura, atualização e exclusão de registros.
## Endpoints

### Link para acesso com o Swagger na máquina local:
```
http://localhost:<yourport>/swagger-ui/index.html
```
### CLIENTES [/cliente]

### 1. Listar Clientes

**Rota:** `GET /cliente`

**Descrição:** Retorna uma lista de todos os clientes.

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    [
        {
            "id": 1,
            "nome": "Nome do Cliente",
            "cpf": "000.000.000-00",
            "sexo": "Sexo do Cliente",
            "dataNascimento": "2023-05-24",
            "telefone": "(00) 90000-0000",
            "email": "email@email.com",
            "senha": "Senha do Cliente"
        }
    ]
    ```

### 2. Criar Cliente

**Rota:** `POST /cliente`

**Descrição:** Cria um novo cliente.

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "nome": "Nome do Cliente",
        "cpf": "000.000.000-00",
        "sexo": "Sexo do Cliente",
        "dataNascimento": "2023-05-24",
        "telefone": "(00) 90000-0000",
        "email": "email@email.com",
        "senha": "Senha do Cliente"
    }
    ```

**Resposta:**

- **Status:** 201 Created
- **Corpo:**
    ```json
    {
        "id": 1,
        "nome": "Nome do Cliente",
        "cpf": "000.000.000-00",
        "sexo": "Sexo do Cliente",
        "dataNascimento": "2023-05-24",
        "telefone": "(00) 90000-0000",
        "email": "email@email.com",
        "senha": "Senha do Cliente"
    }
    ```

### 3. Obter Detalhes de um Cliente

**Rota:** `GET /cliente/{id}`

**Descrição:** Retorna os detalhes de um cliente específico.

**Parâmetros:**

- `id` (obrigatório): ID do cliente

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "nome": "Nome do Cliente",
        "cpf": "000.000.000-00",
        "sexo": "Sexo do Cliente",
        "dataNascimento": "2023-05-24",
        "telefone": "(00) 90000-0000",
        "email": "email@email.come",
        "senha": "Senha do Cliente"
    }
    ```

### 4. Atualizar Cliente

**Rota:** `PUT /cliente/{id}`

**Descrição:** Atualiza um cliente existente.

**Parâmetros:**

- `id` (obrigatório): ID do cliente

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "nome": "Nome Atualizado",
        "cpf": "000.000.000-00",
        "sexo": "Sexo Atualizado",
        "dataNascimento": "2023-05-24",
        "telefone": "(00) 90000-0001",
        "email": "email@email.com",
        "senha": "Senha Atualizada"
    }
    ```

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "nome": "Nome Atualizado",
        "cpf": "000.000.000-00",
        "sexo": "Sexo Atualizado",
        "dataNascimento": "2023-05-24",
        "telefone": "(00) 90000-0001",
        "email": "email@email.com",
        "senha": "Senha Atualizada"
    }
    ```

### 5. Excluir Cliente

**Rota:** `DELETE /cliente/{id}`

**Descrição:** Exclui um cliente.

**Parâmetros:**

- `id` (obrigatório): ID do cliente

**Resposta:**

- **Status:** 204 No Content

### PAGAMENTOS [/pagamentos]

### 1. Listar Pagamentos

**Rota:** `GET /pagamento`

**Descrição:** Retorna uma lista de todos os pagamentos.

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    [
        {
            "id": 1,
            "dataPagamento": "2023-05-24",
            "valorPag": 100.00,
            "formaPag": "Cartão",
            "parcela": 1
        }
    ]
    ```

### 2. Criar Pagamento

**Rota:** `POST /pagamento`

**Descrição:** Cria um novo pagamento.

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "dataPagamento": "2023-05-24",
        "valorPag": 100.00,
        "formaPag": "Cartão",
        "parcela": 1
    }
    ```

**Resposta:**

- **Status:** 201 Created
- **Corpo:**
    ```json
    {
        "id": 1,
        "dataPagamento": "2023-05-24",
        "valorPag": 100.00,
        "formaPag": "Cartão",
        "parcela": 1
    }
    ```

### 3. Obter Detalhes de um Pagamento

**Rota:** `GET /pagamento/{id}`

**Descrição:** Retorna os detalhes de um pagamento específico.

**Parâmetros:**

- `id` (obrigatório): ID do pagamento

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "dataPagamento": "2023-05-24",
        "valorPag": 100.00,
        "formaPag": "Cartão",
        "parcela": 1
    }
    ```

### 4. Atualizar Pagamento

**Rota:** `PUT /pagamento/{id}`

**Descrição:** Atualiza um pagamento existente.

**Parâmetros:**

- `id` (obrigatório): ID do pagamento

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "dataPagamento": "2023-05-24",
        "valorPag": 150.00,
        "formaPag": "Cartão",
        "parcela": 2
    }
    ```

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "dataPagamento": "2023-05-24",
        "valorPag": 150.00,
        "formaPag": "Cartão",
        "parcela": 2
    }
    ```

### 5. Excluir Pagamento

**Rota:** `DELETE /pagamento/{id}`

**Descrição:** Exclui um pagamento.

**Parâmetros:**

- `id` (obrigatório): ID do pagamento

**Resposta:**

- **Status:** 204 No Content

### VIAGENS [/viagens]

### 1. Listar Viagens

**Rota:** `GET /viagem`

**Descrição:** Retorna uma lista de todas as viagens.

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    [
        {
            "id": 1,
            "origem": "Origem da Viagem",
            "destino": "Destino da Viagem",
            "dataIda": "2023-05-24",
            "dataVolta": "2023-05-30"
        }
    ]
    ```

### 2. Criar Viagem

**Rota:** `POST /viagem`

**Descrição:** Cria uma nova viagem.

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "origem": "Origem da Viagem",
        "destino": "Destino da Viagem",
        "dataIda": "2023-05-24",
        "dataVolta": "2023-05-30"
    }
    ```

**Resposta:**

- **Status:** 201 Created
- **Corpo:**
    ```json
    {
        "id": 1,
        "origem": "Origem da Viagem",
        "destino": "Destino da Viagem",
        "dataIda": "2023-05-24",
        "dataVolta": "2023-05-30"
    }
    ```

### 3. Obter Detalhes de uma Viagem

**Rota:** `GET /viagem/{id}`

**Descrição:** Retorna os detalhes de uma viagem específica.

**Parâmetros:**

- `id` (obrigatório): ID da viagem

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "origem": "Origem da Viagem",
        "destino": "Destino da Viagem",
        "dataIda": "2023-05-24",
        "dataVolta": "2023-05-30"
    }
    ```

### 4. Atualizar Viagem

**Rota:** `PUT /viagem/{id}`

**Descrição:** Atualiza uma viagem existente.

**Parâmetros:**

- `id` (obrigatório): ID da viagem

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "origem": "Origem Atualizada",
        "destino": "Destino Atualizado",
        "dataIda": "2023-05-24",
        "dataVolta": "2023-05-30"
    }
    ```

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "origem": "Origem Atualizada",
        "destino": "Destino Atualizado",
        "dataIda": "2023-05-24",
        "dataVolta": "2023-05-30"
    }
    ```

### 5. Excluir Viagem

**Rota:** `DELETE /viagem/{id}`

**Descrição:** Exclui uma viagem.

**Parâmetros:**

- `id` (obrigatório): ID da viagem

**Resposta:**

- **Status:** 204 No Content

### RESERVAS [/reservas]

### 1. Listar Reservas

**Rota:** `GET /reserva`

**Descrição:** Retorna uma lista de todas as reservas.

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    [
        {
            "id": 1,
            "dataReserva": "2023-05-24",
            "clienteId": 1,
            "viagemId": 1,
            "pagamentoId": 1
        }
    ]
    ```

### 2. Criar Reserva

**Rota:** `POST /reserva`

**Descrição:** Cria uma nova reserva.

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "dataReserva": "2023-05-24",
        "clienteId": 1,
        "viagemId": 1,
        "pagamentoId": 1
    }
    ```

**Resposta:**

- **Status:** 201 Created
- **Corpo:**
    ```json
    {
        "id": 1,
        "dataReserva": "2023-05-24",
        "clienteId": 1,
        "viagemId": 1,
        "pagamentoId": 1
    }
    ```

### 3. Obter Detalhes de uma Reserva

**Rota:** `GET /reserva/{id}`

**Descrição:** Retorna os detalhes de uma reserva específica.

**Parâmetros:**

- `id` (obrigatório): ID da reserva

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "dataReserva": "2023-05-24",
        "clienteId": 1,
        "viagemId": 1,
        "pagamentoId": 1
    }
    ```

### 4. Atualizar Reserva

**Rota:** `PUT /reserva/{id}`

**Descrição:** Atualiza uma reserva existente.

**Parâmetros:**

- `id` (obrigatório): ID da reserva

**Requisição:**

- **Cabeçalhos:** `Content-Type: application/json`
- **Corpo:**
    ```json
    {
        "dataReserva": "2023-05-24",
        "clienteId": 1,
        "viagemId": 1,
        "pagamentoId": 1
    }
    ```

**Resposta:**

- **Status:** 200 OK
- **Corpo:**
    ```json
    {
        "id": 1,
        "dataReserva": "2023-05-24",
        "clienteId": 1,
        "viagemId": 1,
        "pagamentoId": 1
    }
    ```

### 5. Excluir Reserva

**Rota:** `DELETE /reserva/{id}`

**Descrição:** Exclui uma reserva.

**Parâmetros:**

- `id` (obrigatório): ID da reserva

**Resposta:**

- **Status:** 204 No Content

## Erros

### Estrutura de Erro

**Exemplo de Resposta de Erro:**

```json
{
    "error": "id não encontrado"
}
