# API REST para Sistema de Licitação da Prefeitura

## Casos de Uso

1. Gerenciar licitações
2. Gerenciar propostas de fornecedores
3. Gerenciar fornecedores cadastrados
4. Consultar o histórico de licitações

## Recursos

- `licitacoes`
- `propostas`
- `fornecedores`
- `historico`

## Endpoints

### Licitações

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros Esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar todas as licitações | `GET /licitacoes` | `GET` | Vazio | `200 OK` com lista de licitações | `401 Unauthorized` |
| Retornar uma licitação específica | `GET /licitacoes/{licitacao-id}` | `GET` | Vazio | `200 OK` com detalhes da licitação | `404 Not Found` |
| Criar nova licitação | `POST /licitacoes` | `POST` | `{ "titulo": "Construção de Escola", "descricao": "Construção de uma nova escola na região", "dataInicio": "2024-01-01", "dataFim": "2024-12-31" }` | `201 Created` com detalhes da licitação criada | `400 Bad Request` |
| Atualizar licitação | `PUT /licitacoes/{licitacao-id}` | `PUT` | `{ "titulo": "Construção de Escola", "dataFim": "2024-02-15" }` | `200 OK` com detalhes da licitação atualizada | `404 Not Found` |
| Deletar uma licitação | `DELETE /licitacoes/{licitacao-id}` | `DELETE` | Vazio | `204 No Content` | `404 Not Found` |

### Propostas

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros Esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar todas as propostas de uma licitação | `GET /licitacoes/{licitacao-id}/propostas` | `GET` | Vazio | `200 OK` com lista de propostas | `404 Not Found` |
| Criar nova proposta | `POST /licitacoes/{licitacao-id}/propostas` | `POST` | `{ "fornecedorId": "12345", "valor": 50000, "documentos": ["doc1.pdf", "doc2.pdf"] }` | `201 Created` com detalhes da proposta criada | `404 Not Found` |
| Retornar uma proposta específica | `GET /propostas/{proposta-id}` | `GET` | Vazio | `200 OK` com detalhes da proposta | `404 Not Found` |
| Atualizar proposta | `PUT /propostas/{proposta-id}` | `PUT` | `{ "valor": 48000 }` | `200 OK` com detalhes da proposta atualizada | `404 Not Found` |
| Deletar uma proposta | `DELETE /propostas/{proposta-id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` |

### Fornecedores

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros Esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar todos os fornecedores | `GET /fornecedores` | `GET` | Vazio | `200 OK` com lista de fornecedores | `401 Unauthorized` |
| Retornar um fornecedor específico | `GET /fornecedores/{fornecedor-id}` | `GET` | Vazio | `200 OK` com detalhes do fornecedor | `404 Not Found` |
| Criar novo fornecedor | `POST /fornecedores` | `POST` | `{ "nome": "Fornecedor XYZ", "cnpj": "12.345.678/0001-90", "contato": "xyz@mail.com" }` | `201 Created` com detalhes do fornecedor criado | `400 Bad Request` |
| Atualizar fornecedor | `PUT /fornecedores/{fornecedor-id}` | `PUT` | `{ "nome": "Fornecedor XYZ Atualizado" }` | `200 OK` com detalhes do fornecedor atualizado | `404 Not Found` |
| Deletar um fornecedor | `DELETE /fornecedores/{fornecedor-id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` |

### Histórico de Licitações

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros Esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar histórico de licitações | `GET /historico` | `GET` | Vazio | `200 OK` com lista de licitações encerradas | `401 Unauthorized` |
| Retornar histórico de propostas | `GET /historico/{licitacao-id}/propostas` | `GET` | Vazio | `200 OK` com lista de propostas para uma licitação específica | `404 Not Found` |