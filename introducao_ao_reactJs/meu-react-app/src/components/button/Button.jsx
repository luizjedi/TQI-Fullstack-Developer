import React from "react";
import "./Button.css";

function Button(props) {

    const { name, onClick } = props;

    return (
        <button className="body" onClick={onClick}>{name} </button>
    )
}

export default Button