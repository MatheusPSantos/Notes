def build_tree(self):
  """ Constrói uma merkle tree utilizando uma pilha para combinar as folhas,

  3

  e combinando os nós na pilha quando estão na mesma altura da árvore.
  Criado por: evankozliner. Disponível no github.
  """
  stack = []
  self._handle_solo_node_case()
  while self.root_hash == None:
    if len(stack) >= 2 and stack[-1].height == stack[-2].height:
      mom = stack.pop()
      dad = stack.pop()
      child_hash = self._md5sum(mom.hash + dad.hash)
      child = self.Node(mom, dad, child_hash)
      self.node_table[child_hash] = child
      mom.child = child
      dad.child = child

    if child.height == self.max_height:
      self.root_hash = child.hash

      stack.append(child)
    elif len(self.leaves) > 0:
      leaf = self.leaves.pop()
      self.node_table[leaf.hash] = leaf
      stack.append(leaf)
      # Handle case where last 2 nodes do not match in height by "graduating"
      # last node
    else:
      stack[-1].height += 1

self.is_built = True