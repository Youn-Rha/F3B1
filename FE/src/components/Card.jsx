import React from "react";

export function Card({ className, children }) {
  return <div className={`card ${className}`}>{children}</div>;
}

export function CardContent({ className, children }) {
  return <div className={`card-content ${className}`}>{children}</div>;
}

export function CardFooter({ className, children }) {
  return <div className={`card-footer ${className}`}>{children}</div>;
}
