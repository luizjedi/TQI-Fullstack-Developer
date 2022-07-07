import React from "react";
import "./CompA.css";

function CompA(props) {

    return (
        <div className="body1">
            Componente A =D
            <div>
                {props.children}
            </div>
        </div>
    )
}

export default CompA