# REST x GraphQL

## Introduction

Created by Facebook in 2015, that transfers GraphQL to a non-profit organization, GraphQL Foundation.

One of the keys behind REST API's is the endpoint pattern. For example: 
> GET /search/repositories?q=starts:>100

That be considers low-level abstrations. By contrast GraphQL is a full data query language to implement web-based services.
- high-level abstractions:
    - schemas
    - types
    - queries
    - mutations

```
query serachRepositories {
    search(query: "stars:>100", first:100, type:REPOSITORY) {
        nodes {
            ... on Repository { nameWithOwner }
        }
    }
}
```

Problems of REST:
- over-fetching

Web service:
- Collections of protocols and standards used to exchange data between web system.
- Several implementations: SOAP, REST GraphQL and others

### REST - Representational State Transfer
    
Is an archtitectural style for implementing distributed systems. Provides uniform interface for system components based on resource identification and dynamic data provision.

The data are exposed by endpoints.

### GraphQL

In GraphQL, service data is exposed as a graph, defined by means of a schema. Each node of this graph/schema represents objects and contains fields. Each field has name and type.

Supports interfaces, that is and abstract type that includes fields that a type must deifine when implementing the interface.

In graphQL schemas, queries are defined using a special type, called Query.

```
type Query {
    repository(name:String!, owner:String!): Repository
    ...
}
```

### Differences:

In GraphQL, service data is exposed as a graph, represented by schema. In REST, server applications implement a list of endpoints.

Benefits

The avaliability of a type system - expressed as a schema - is one of the key benefits provided by GraphQL.

## References

The main reference is https://arxiv.org/pdf/2003.04761.pdf
