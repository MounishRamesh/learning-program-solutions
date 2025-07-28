

import React, { useState } from 'react';

function TodoList() {
  const [items, setItems] = useState(["Learn React", "Submit Assignment"]);

  return (
    <div>
      <h3>Todo List</h3>
      <ul>
        {items.map((item, i) => <li key={i}>{item}</li>)}
      </ul>
    </div>
  );
}

export default TodoList;
