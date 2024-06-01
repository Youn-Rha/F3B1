import React from "react";

export function Avatar({ className, children }) {
  return (
    <div className={`avatar ${className}`}>
      {children}
    </div>
  );
}

export function AvatarImage({ src, alt }) {
  return <img src={src} alt={alt} className="avatar-image" />;
}

export function AvatarFallback({ children }) {
  return <div className="avatar-fallback">{children}</div>;
}
