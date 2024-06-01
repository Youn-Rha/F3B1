import React, { useState } from "react";

export function DropdownMenu({ children }) {
  return <div className="dropdown-menu">{children}</div>;
}

export function DropdownMenuTrigger({ asChild, children }) {
  return React.cloneElement(children, { className: `${children.props.className} dropdown-trigger` });
}

export function DropdownMenuContent({ align, children }) {
  const alignment = align === "end" ? "dropdown-content-end" : "dropdown-content-start";
  return <div className={`dropdown-content ${alignment}`}>{children}</div>;
}

export function DropdownMenuItem({ children }) {
  return <div className="dropdown-item">{children}</div>;
}

export function DropdownMenuSeparator() {
  return <div className="dropdown-separator"></div>;
}
