

import React, { useState } from 'react';

function FormInput() {
  const [text, setText] = useState("");

  return (
    <div>
      <input 
        type="text" 
        value={text} 
        onChange={(e) => setText(e.target.value)} 
        placeholder="Type something" 
      />
      <p>You typed: {text}</p>
    </div>
  );
}

export default FormInput;
